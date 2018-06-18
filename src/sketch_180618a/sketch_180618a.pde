int y = 0;
int score;
void setup(){
 size(500,500); 
}
void draw(){
 background(0,255,0);
 fill(0, 0, 255);
 stroke(0, 0, 255);
 ellipse(200, y, 200, 300);
 if (y>500){
  y=0; 
 }
 y++;
 rect(mouseX, 450, 50, 50);
 if(mouseX<200 && 200<mouseX+50 && mouseY == y){
   score++;
   println(score,"SCORE!!!!!!");
   
} }