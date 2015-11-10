public class DemoShader extends Shader {

	void shader(double[] p, double u, double v, double t) {

		double g1, g2, g3;
		g1 = 0.5 + 0.5*SimplexNoise.noise((u-0.5)*16.0, (0.5-v)*16.0, t*0.1);
		g2 = 0.5 + 0.5*ImprovedNoise.noise((u-0.5)*16.0, (0.5-v)*16.0, t*0.1);
		g3 = 0.5 + 0.5*PerlinSimplexNoise.noise((u-0.5)*16.0, (0.5-v)*16.0, t*0.1);
		p[0]=g1;
		p[1]=g2;
		p[2]=g3;
		
	}

}
