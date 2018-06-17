import ddf.minim.*;
PImage Hogan;
Minim minim;
AudioPlayer song;
void setup(){
  minim = new Minim(this);
song = minim.loadFile("Don_t Sit Under the Apple Tree.mp3", 512);
size(775, 775);
Hogan= loadImage("hogan.jpg");
}
void draw(){
 image(Hogan, 0, 0);
 if (mousePressed){
     rotateImage(Hogan, 10);
     song.play();
}
else{
  song.pause();
}
}
void rotateImage(PImage image, int amountToRotate) {
     translate(width/2, height/2);
     rotate(amountToRotate*TWO_PI/360);
     translate(-image.width/2, -image.height/2);
}