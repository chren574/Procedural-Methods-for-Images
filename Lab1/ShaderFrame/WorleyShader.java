
public class WorleyShader extends Shader {
	
	void shader(double[] p, double u, double v, double t) {
		
		
		double[] at = {u*15, v*15, 0.5*t};
		int max_order = 2;
		double[] F = new double[2];
		double[][] delta = new double[2][3];
		int[] ID = new int[2];
		 
		WorleyNoise.noise(at, max_order, F, delta, ID);
		
		p[0] = (F[1]-F[0])*0.5;
		p[1] = p[0];
		p[2] = p[0];
		
	}

}
