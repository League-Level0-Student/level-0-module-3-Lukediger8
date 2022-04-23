
void setup() {
 
  // set the size of your sketch
  size(500,500);
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  int remainder=0;
  for (int i = 100; i > 0; i -= 20){
  remainder++;
  if (remainder%2==0){
  fill(255,255,255);
  }
  else{
    fill(255,0,0);
  }
    ellipse(250,250,i,i);
  }
  //Use an if statement and remainder to alternate the color of your rings.
  
}
