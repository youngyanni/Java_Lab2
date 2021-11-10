public class Point3d {
    private double xCoord; // координата X
    private double yCoord; // координата Y
    private double zCoord; // координата Z

    public Point3d ( double x, double y,double z) {//Конструктор инициализации
        this.xCoord = x;
        this.yCoord = y;
        this.zCoord = z;
    }
    public Point3d () {  //Создание нового объекта Point3d с тремя значениями с плавающей точкой(double)
        double x=0.0;
        double y=0.0;
        double z=0.0;
    }
    public double getX () {
        return xCoord;
    }//Возможность получения и изменения значений
    public double getY () {
        return yCoord;
    }
    public double getZ () {
        return zCoord;
    }
    public void setX ( double val) {
        xCoord = val;
    }
    public void setY ( double val) {
        yCoord = val;
    }
    public void setZ ( double val) {
        zCoord = val;
    }
    public boolean equals(Point3d obj){ //Метод сравнения значений двух объектов
        return (this.xCoord == obj.xCoord && this.yCoord == obj.yCoord && this.zCoord == obj.zCoord);
    }
    public double distanceTo (Point3d obj){// Метод для вычисления расстояния между двумя точками
        double X = obj.xCoord - this.xCoord;
        double Y = obj.yCoord - this.yCoord;
        double Z = obj.zCoord - this.zCoord;
        double dist = Math.sqrt(X*X+Y*Y+Z*Z);
        dist = Math.round(dist*100)/100.0;
        System.out.println("Расстояние между точками равно = " + dist);
        return dist;
    }
}
