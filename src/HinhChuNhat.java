public class HinhChuNhat {
    public float dai;
    public float rong;

    public HinhChuNhat (){

    }
    public HinhChuNhat(float d, float r){
        this.dai = d;
        this.rong = r;
    }
    public float chuviHinhChuNhat(){
        return (this.dai+ this.rong)*2 ;
    }
    public float dientichHinhChuNhat(){
        return this.dai * this.rong ;
    }
}
