PImage pictureOfRecord;  //as member variable
pictureOfRecord= loadImage("record.jpg");  //in setup method  
image(pictureOfRecord, xPosition, yPosition);//in draw method
size(pictureOfRecord.width, pictureOfRecord.height);
void rotateImage(PImage image, int amountToRotate) {
     translate(width/2, height/2);
     rotate(amountToRotate*TWO_PI/360);
     translate(-image.width/2, -image.height/2);
}
import ddf.minim.*;  //at the very top of your sketch
Minim minim;  //as a member variable
AudioPlayer song;  //as a member variable
minim = new Minim(this);  //in the setup method
song = minim.loadFile("awesomeTrack.mp3", 512);//in the setup method
song.play();
mousePressed
song.play()
song.pause()