class Mammal{
    protected boolean sleeping = false;
    public void regulateTemperature() {
        System.out.println("Mi temperatura es la ideal justo ahora.");
    }
    public void startSleeping() {
        sleeping = true;
        System.out.println("ZzZz");
    }
    public boolean isSleeping(){
        return sleeping;
    }
    
}