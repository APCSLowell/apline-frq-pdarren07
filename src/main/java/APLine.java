public class APLine
{
  /* your code here */
  private double a, b, c;
  public APLine(int x, int y, int z){
    a = x;
    b = y;
    c = z;
  }
  public double getSlope(){
    return -(a/b);
  }
  public boolean isOnLine(int x, int y){
    return (a * x + b * y + c) == 0;
  }
}
