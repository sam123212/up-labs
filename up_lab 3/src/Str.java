
import java.awt.*;
import java.awt.geom.GeneralPath;
import java.awt.geom.PathIterator;

public class Str implements Stroke {

    private float ampl =8 ;
    private float wave = 10;

    BasicStroke stroke;

    public Str(float width)
    {
        this.stroke = new BasicStroke(width);
    }

    @Override
    public Shape createStrokedShape(Shape p) {
        GeneralPath path = new GeneralPath();
        float points[] = new float[2];
        float moveX = 0, moveY = 0;
        float lastX = 0, lastY = 0;
        float thisX, thisY;
        int type;
        float next = 0;
        int phase = 0;

        for (PathIterator it = p.getPathIterator(null); !it.isDone(); it.next()) {
            type = it.currentSegment( points );
            switch( type ){
                case PathIterator.SEG_MOVETO:
                    moveX = lastX = points[0];
                    moveY = lastY = points[1];
                    path.moveTo( moveX, moveY );
                    next = wave;
                    break;

                case PathIterator.SEG_CLOSE:
                    points[0] = moveX;
                    points[1] = moveY;
                case PathIterator.SEG_LINETO:
                    thisX = points[0];
                    thisY = points[1];
                    float dx = thisX - lastX;
                    float dy = thisY - lastY;
                    float distance = (float)Math.sqrt( dx*dx + dy*dy );
                    float c=dx/distance, s=dy/distance;
                    if ( distance >= next ) {
                        while ( distance >= next ) 
                        {
                            float x = lastX + next * c;
                            float y = lastY + next * s;
                            path.lineTo(x,y);
                            if ( (phase % 2) != 0)                          
                            	path.lineTo(x + ampl * s, y - ampl * c);
                            next += wave;
                            phase++;
                        }
                    }
                    next -= distance;
                    lastX = thisX;
                    lastY = thisY;
                    if ( type == PathIterator.SEG_CLOSE )
                    {
                    	path.closePath();
                    }
                    break;
            }
        }

        return stroke.createStrokedShape(path);
    }
}