package pl.migibud.day1extras.ex2;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public class ITCompany {

    private final List<Programmer> programmerList;

    public ITCompany() {
        this.programmerList = new ArrayList<>();
    }

    public boolean addProgrammerToCompany(Programmer programmer){
        if(programmer==null){
            return false;
        }
        this.programmerList.add(programmer);
        return true;
    }

    public List<Programmer> getMaleProgrammers() {
        return this.programmerList.stream()
                .filter(v->v.getPerson().getGender()==Gender.MALE)
                .collect(Collectors.toList());
    }

    public List<Programmer> getProgrammersUnder18ProgrammingJava() {
        return this.programmerList.stream()
                .filter(v->v.getPerson().getAge()<18)
                .filter(v->(v.getProgrammingLanguages().contains("JAVA"))
                        ||(v.getProgrammingLanguages().contains("java"))
                        ||(v.getProgrammingLanguages().contains("Java")))
                .collect(Collectors.toList());
    }


    public List<Programmer> getProgrammersWhoKnowsMoreThanOneProgrammingLanguage(){
        return this.programmerList.stream()
                .filter(v->v.getProgrammingLanguages().size()>1)
                .collect(Collectors.toList());
    }

    public List<Programmer> getFemaleProgrammersWhoKnowsJavaAndCsharp(){
        return this.programmerList.stream()
                .filter(v->v.getPerson().getGender()==Gender.FEMALE)
                .collect(Collectors.toList());
    }
}
