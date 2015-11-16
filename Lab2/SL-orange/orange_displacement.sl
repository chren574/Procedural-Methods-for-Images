#include "voronoi.sl"

// A simple SL displacement shader to render a planet-like sphere
displacement orange_displacement(output varying float oceanblend = 0.0;) {
  	
	float elevation = noise(P)-0.5;
  
	float f;
	point pos;
	point Plocal = P*50;
	float freq = 0.5;
	float jitter = 1;
	
	// Noice function
	voronoi_f1_3d (Plocal, freq, jitter, f, pos);
	
	// Returns values between 0 and 1
  	float granulate = clamp(f, 0.0, 1.0);
	
	// Adding the granulated pattern
  	P = P - N * 0.01 * granulate;

	// Making the sphere have an irregular from
	P += N * 0.2 * elevation;
  	
	N = calculatenormal(P);
}
