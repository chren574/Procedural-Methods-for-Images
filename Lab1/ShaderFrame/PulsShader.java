
public class PulsShader extends Shader {
	
	void shader(double[] p, double u, double v, double t) {
		
		double g;
		
		g = Math.sin(0.5*PerlinSimplexNoise.noise((u-0.5)*16.0, (0.5-v)*16.0, t*0.1)) + Math.sin(t)*v;
		
		p[0] = g;		
		
	}

}
