package pl.migibud.workbook.sdaadvadvancedexes.part3.ex3;

public class Car {

    private String name;
    private CarType type;
    private Engine engine;

    public Car(String name, CarType type) {
        this.name = name;
        this.type = type;
        this.engine = new Engine();
        engine.setEngineType();
    }

    public class Engine{

        private String engineType;

        public void setEngineType(){
            switch (type){
                case LUXURY:
                    this.engineType = "electric";
                    break;
                case ECONOMY:
                    this.engineType = "diesel";
                    break;
                default:
                    this.engineType = "petrol";
                    break;
            }
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "engineType='" + engineType + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", engine=" + engine +
                '}';
    }

    public Engine getEngine() {
        return engine;
    }
}
