
import java.lang.*;

public class ColorShader extends Shader {
	
	void shader(double[] p, double u, double v, double t) {

		u = 0.5 + Math.sin(0.5*t);
		v = 0.8 - Math.cos(0.5*t);
		
		p[0]=u;
		p[1]=v;
		p[2]=u*v;
		
	}
	
}
