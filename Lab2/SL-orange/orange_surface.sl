#include "voronoi.sl"

// A simple SL surface shader to render a planet-like sphere
surface orange_surface() {

  color Orange = color(1.0, 0.6, 0.0); // Orange color
 
  Ci = Orange * diffuse(N);

}
