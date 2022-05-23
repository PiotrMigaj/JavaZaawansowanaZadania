package pl.migibud.day1extras.ex2;

import lombok.Getter;
import org.apache.commons.collections4.ListUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
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
                .filter(v-> ListUtils.intersection(v.getProgrammingLanguages(),List.of("Java","JAVA","java")).size()==1)
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
                .filter(v->ListUtils.intersection(v.getProgrammingLanguages(),List.of("Java","JAVA","java","c#","C#")).size()==2)
                .collect(Collectors.toList());
    }

    public List<String> getNamesOfMaleProgrammers(){
        return this.programmerList.stream()
                .filter(v->v.getPerson().getGender()==Gender.MALE)
                .map(v->v.getPerson().getFirstName())
                .collect(Collectors.toList());
    }

    public Set<String> getAllLanguagesKnownByProgrammers(){
        return this.programmerList.stream()
                .flatMap(v->v.getProgrammingLanguages().stream())
                .map(String::toLowerCase)
                .collect(Collectors.toSet());
    }

    public List<String> getLastnamesOfProgrammersWhoKnowsMoreThanTwoLanguages(){
        return this.programmerList.stream()
                .filter(v->v.getPerson().getGender()==Gender.MALE)
                .filter(v->v.getProgrammingLanguages().size()>2)
                .map(v->v.getPerson().getLastName())
                .collect(Collectors.toList());
    }

    public boolean ifThereIsAPersonWhoDoesntKnowAnyLanguage(){
        return this.programmerList.stream()
                .anyMatch(v->v.getProgrammingLanguages().size()==0);
    }
}
