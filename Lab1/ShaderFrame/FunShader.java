
public class FunShader extends Shader{
	
	void shader(double[] p, double u, double v, double t) {

		double g1, g2, g3;
		g1 = 0.5 + 0.5*SimplexNoise.noise((u-0.5)*16.0, (0.5-v)*16.0, t*0.1);
		g2 = 0.5 + 0.5*ImprovedNoise.noise((u-0.5)*16.0, (0.5-v)*16.0, t*0.1);
		g3 = 0.5 + 0.5*PerlinSimplexNoise.noise((u-0.5)*16.0, (0.5-v)*16.0, t*0.1);
		//p[0]=0.5 + u;
		
		double k = (Math.sin(t*u*v) > 0) ? ((v + 0.5) + (u - 0.5))*g3 : v*u*g1;
		//double h = (Math.sin(t*u*v + 1) < 0) ? Math.sqrt(v*u) : 0;
		
		p[0]= k;
		p[1]= k;
		p[2]= k;
		
	}

}
