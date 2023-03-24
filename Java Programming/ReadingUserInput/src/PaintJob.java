public class PaintJob {
    public static void main(String[] args) {
//       PaintJob.getBucketCount(3.4,2.1,1.5,2);
        System.out.println(getBucketCount(3.26,0.75));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, double extraBuckets){
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0 ){
            return -1;
        }
        double areaToPaint = width * height;
        double areaWeCanPaint = areaPerBucket * extraBuckets;
        double areaLeftToPaint = areaToPaint - areaWeCanPaint;
        if (areaLeftToPaint < 0){
            return 0;
        }else {
            return (int) Math.round(areaLeftToPaint/areaPerBucket);
        }
    }
    public static int getBucketCount(double width,double height, double areaPerBucket){
        if (width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }else {
            double areaToPaint = width * height;
            return (int) Math.round(areaToPaint/areaPerBucket);
        }
    }
    public static int getBucketCount(double area, double areaPerBucket){
        if (area <= 0 || areaPerBucket <= 0){
            return -1;
        }
        return (int) Math.round(area/areaPerBucket);
    }
}