package pl.migibud.day1.ex16;

import java.util.Arrays;

public enum Runner {
    BEGINNER(360,380),
    INTERMEDIATE(300,359),
    ADVANCED(200,299);

    private int minNumbersOfMinutesOfMarathon;
    private int maxNumbersOfMinutesOfMarathon;

    Runner(int minNumbersOfMinutesOfMarathon,int maxNumbersOfMinutesOfMarathon){
        this.minNumbersOfMinutesOfMarathon=minNumbersOfMinutesOfMarathon;
        this.maxNumbersOfMinutesOfMarathon=maxNumbersOfMinutesOfMarathon;
    }

/*    public static Runner getFitnessLevel(int timeOfMarathon){
        if (timeOfMarathon>=360&&timeOfMarathon<=380){
            return BEGINNER;
        }
        if (timeOfMarathon>=300&&timeOfMarathon<=359){
            return INTERMEDIATE;
        }
        if (timeOfMarathon>=200&&timeOfMarathon<=299){
            return ADVANCED;
        }
        return null;
    }*/

        public static Runner getFitnessLevel(int timeOfMarathon){

            return Arrays.stream(values())
                    .filter(r-> timeOfMarathon < r.maxNumbersOfMinutesOfMarathon)
                    .filter(r->timeOfMarathon>r.minNumbersOfMinutesOfMarathon)
                    .findAny()
                    .orElseThrow(()->new RuntimeException("There is no such runner."));
    }

}
