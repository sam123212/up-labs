


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.JobAttributes;
import java.awt.JobAttributes.SidesType;
import java.awt.PageAttributes;
import java.awt.PageAttributes.OrientationRequestedType;
import java.awt.PrintJob;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.Writer;
import java.text.DateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.TimeZone;

public class HardcopyWriter extends Writer
{
    // These are the instance variables for the class
    protected PrintJob job; // The PrintJob object in use
    protected Graphics page; // Graphics object for current page
    protected String jobname; // The name of the print job
    protected int fontsize; // Point size of the font
    protected String time; // Current time (appears in header)
    protected Dimension pagesize; // Size of the page (in dots)
    protected int pagedpi; // Page resolution in dots per inch
    protected Font font, headerfont; // Body font and header font
    protected FontMetrics metrics; // Metrics for the body font
    protected FontMetrics headermetrics; // Metrics for the header font
    protected int x0, y0; // Upper-left corner inside margin
    protected int width, height; // Size (in dots) inside margins
    protected int headery; // Baseline of the page header
    protected int charwidth; // The width of each character
    protected int lineheight; // The height of each line
    protected int lineascent; // Offset of font baseline
    protected int chars_per_line; // Number of characters per line
    protected int lines_per_page; // Number of lines per page
    protected int charnum = 0, linenum = 0; // Current column and line position
    protected int pagenum = 0; // Current page number

    // A field to save state between invocations of the write() method
    private boolean last_char_was_return = false;

    // A static variable that holds user preferences between print jobs
    protected static Properties printprops = new Properties();

    /**
     * The constructor for this class has a bunch of arguments: The frame
     * argument is required for all printing in Java. The jobname appears left
     * justified at the top of each printed page. The font size is specified in
     * points, as on-screen font sizes are. The margins are specified in inches
     * (or fractions of inches).
     **/
    public HardcopyWriter(String jobname, int fontsize, double leftmargin,
            double rightmargin, double topmargin, double bottommargin)
            throws HardcopyWriter.PrintCanceledException
    {
        // Get the PrintJob object with which we'll do all the printing.
        // The call is synchronized on the static printprops object, which
        // means that only one print dialog can be popped up at a time.
        // If the user clicks Cancel in the print dialog, throw an exception.
        final Frame frame = new Frame();
        final Toolkit toolkit = frame.getToolkit(); // get Toolkit from Frame
        synchronized (printprops)
        {
        	JobAttributes jobAttributes = new JobAttributes();
        	jobAttributes.setSides(SidesType.TWO_SIDED_LONG_EDGE);
        	PageAttributes pageAttributes = new PageAttributes();
        	pageAttributes.setOrientationRequested(OrientationRequestedType.LANDSCAPE);
        	job = toolkit.getPrintJob(frame, jobname, jobAttributes,pageAttributes);
        }
        if (job == null)
            throw new PrintCanceledException("User cancelled print request");
        pagesize = job.getPageDimension(); // query the page size
        pagedpi = job.getPageResolution(); // query the page resolution

        // Bug Workaround:
        // On windows, getPageDimension() and getPageResolution don't work, so
        // we've got to fake them.
        if (System.getProperty("os.name").regionMatches(true, 0, "windows", 0,
                7))
        {
            // Use screen dpi, which is what the PrintJob tries to emulate
            pagedpi = toolkit.getScreenResolution();
            // Assume a 8.5" x 11" page size. A4 paper users must change this.
            pagesize = new Dimension((int) (8.5 * pagedpi), 11 * pagedpi);
            // We also have to adjust the fontsize. It is specified in points,
            // (1 point = 1/72 of an inch) but Windows measures it in pixels.
            fontsize = (fontsize * pagedpi) / 72;
        }

        // Compute coordinates of the upper-left corner of the page.
        // I.e. the coordinates of (leftmargin, topmargin). Also compute
        // the width and height inside of the margins.
        x0 = (int) (leftmargin * pagedpi);
        y0 = (int) (topmargin * pagedpi);
        width = pagesize.width - (int) ((leftmargin + rightmargin) * pagedpi);
        height = pagesize.height - (int) ((topmargin + bottommargin) * pagedpi);

        // Get body font and font size
        font = new Font("Monospaced", Font.PLAIN, fontsize);
        metrics = frame.getFontMetrics(font);
        lineheight = metrics.getHeight();
        lineascent = metrics.getAscent();
        charwidth = metrics.charWidth('0'); // Assumes a monospaced font!

        // Now compute columns and lines will fit inside the margins
        chars_per_line = (height / charwidth) - 15;
        lines_per_page = (width / lineheight) - 6;

        // Get header font information
        // And compute baseline of page header: 1/8" above the top margin
        headerfont = new Font("SansSerif", Font.ITALIC, fontsize);
        headermetrics = frame.getFontMetrics(headerfont);
        headery = (y0 - (int) (0.125 * pagedpi) - headermetrics.getHeight())
                + headermetrics.getAscent();

        // Compute the date/time string to display in the page header
        final DateFormat df = DateFormat.getDateTimeInstance(DateFormat.LONG,
                DateFormat.SHORT);
        df.setTimeZone(TimeZone.getDefault());
        time = df.format(new Date());

        this.jobname = jobname; // save name
        this.fontsize = fontsize; // save font size
    }

    boolean isdraw = true;

    /**
     * This is the write() method of the stream. All Writer subclasses implement
     * this. All other versions of write() are variants of this one
     **/
    @Override
    public void write(char[] buffer, int index, int len)
    {
        // Loop through all the characters passed to us

        for (int i = index; i < (index + len); i++)
        {
            // If we haven't begun a page (or a new page), do that now.
            if (page == null)
                newpage();
            if (isdraw)
            {
                final char[] b = "(x^2+y^2)^3-4a^2*x^2*y^2=0".toCharArray();
                final BufferedImage bf = new BufferedImage(400, 400,
                        BufferedImage.TYPE_INT_ARGB);
                final Graphics2D tg = bf.createGraphics();
                tg.setColor(Color.white);
                tg.fillRect(0, 0, 400, 400);
                tg.setColor(Color.BLACK);    
                tg.translate(150, 150);
                tg.drawLine(-150, 0, 150, 0);
                tg.drawLine(0, 150, 0, -150);
                tg.setStroke(new Str(2f));
                tg.draw(new Graph(160));
                page.drawImage(bf, 50, (width / 2) - 200, null); // Set the
                                                                 // header font.
                page.drawChars(b, 0, b.length, 75, width - 175);
                isdraw = false;
            }
            // If the character is a line terminator, then begin new line,
            // unless it is a \n immediately after a \r.
            if (buffer[i] == '\n')
            {
                if (!last_char_was_return)
                    newline();
                continue;
            }
            if (buffer[i] == '\r')
            {
                newline();
                last_char_was_return = true;
                continue;
            } else
                last_char_was_return = false;

            // If it some other non-printing character, ignore it.
            if (Character.isWhitespace(buffer[i])
                    && !Character.isSpaceChar(buffer[i]) && (buffer[i] != '\t'))
                continue;

            // If no more characters will fit on the line, start new line.
            if (charnum >= chars_per_line)
            {
                newline();
                // Also start a new page, if necessary
                if (page == null)
                    newpage();
            }

            // Now print the character:
            // If it is a space, skip one space, without output.
            // If it is a tab, skip the necessary number of spaces.
            // Otherwise, print the character.
            // It is inefficient to draw only one character at a time, but
            // because our FontMetrics don't match up exactly to what the
            // printer uses we need to position each character individually
            if (Character.isSpaceChar(buffer[i]))
                charnum++;
            else if (buffer[i] == '\t')
                charnum += 8 - (charnum % 8);
            else
            {	
            	if(page != null)
            		page.drawChars(buffer, i, 1, x0 + (charnum * charwidth), y0
            				+ (linenum * lineheight) + lineascent);
                charnum++;
            }
        }

    }

    /**
     * This is the flush() method that all Writer subclasses must implement.
     * There is no way to flush a PrintJob without prematurely printing the
     * page, so we don't do anything.
     **/
    @Override
    public void flush()
    { /* do nothing */
    }

    /**
     * This is the close() method that all Writer subclasses must implement.
     * Print the pending page (if any) and terminate the PrintJob.
     */
    @Override
    public void close()
    {
        if (page != null)
            page.dispose(); // Send page to the printer
        job.end(); // Terminate the job
    }

    /**
     * Set the font style. The argument should be one of the font style
     * constants defined by the java.awt.Font class. All subsequent output will
     * be in that style. This method relies on all styles of the Monospaced font
     * having the same metrics.
     **/
    public void setFontStyle(int style)
    {
        // Try to set a new font, but restore current one if it fails
        final Font current = font;

        try
        {
            font = new Font("Monospaced", style, fontsize);
        } catch (final Exception e)
        {
            font = current;
        }
        // If a page is pending, set the new font. Otherwise newpage() will
        if (page != null)
            page.setFont(font);
    }

    /** End the current page. Subsequent output will be on a new page. */
    public void pageBreak()
    {
        newpage();
    }

    /** Return the number of columns of characters that fit on the page */
    public int getCharactersPerLine()
    {
        return this.chars_per_line;
    }

    /** Return the number of lines that fit on a page */
    public int getLinesPerPage()
    {
        return this.lines_per_page;
    }

    /** This internal method begins a new line */
    protected void newline()
    {
        if (pagenum == 1)
            charnum = 350 / charwidth;
        else
            charnum = 0; // Reset character number to 0
        linenum++; // Increment line number
        if (linenum >= lines_per_page)
        { // If we've reached the end of page
            page.dispose(); // send page to printer
            page = null; // but don't start a new page yet.
        }
    }

    /** This internal method begins a new page and prints the header. */
    protected void newpage()
    {
        page = job.getGraphics(); // Begin the new page
        linenum = 0;
        charnum = 0; // Reset line and char number
        pagenum++; // Increment page number
        // Set the header font.
        if(page != null)
        	page.setFont(font);
    }

    /**
     * This is the exception class that the HardcopyWriter constructor throws
     * when the user clicks "Cancel" in the print dialog box.
     **/
    public static class PrintCanceledException extends Exception
    {
        /**
		 * 
		 */
		private static final long serialVersionUID = 1253391831404613915L;

		public PrintCanceledException(String msg)
        {
            super(msg);
        }
    }
}

