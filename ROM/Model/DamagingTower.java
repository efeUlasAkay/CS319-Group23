public class DamagingTower extends Tower {

    public DamagingTower(int x, int y){
        super(x,y);
        range = 100;
        damage = 50;
        setupTime = 30;
        frequency = 1;
        cost = 50;
        super.setup(setupTime);
    }
}