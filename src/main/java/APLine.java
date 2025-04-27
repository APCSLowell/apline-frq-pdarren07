public class APLine
{
  /* your code here */
  private int a, b, c;
  public APLine(int x, int y, int z){
    a = x;
    b = y;
    c = z;
  }
  public double getSlope(){
    return (double) -a/b;
  }
  public boolean isOnLine(int x, int y){
    return (ax + b*y + c) == 0;
  }
}
