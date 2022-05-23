package pl.migibud.day1extras.ex2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

class ITCompanyTest {

    private ITCompany itCompany;

    @BeforeEach
    void setUp(){
        itCompany=new ITCompany();
    }

    @Test
    void shouldReturnListOfMaleProgrammers(){
        //given
        Programmer programmer1 = new Programmer(new Person("Piotr","Migaj",30,Gender.MALE), List.of("C#","Java","Python"));
        Programmer programmer2 = new Programmer(new Person("Anna","Migaj",30,Gender.FEMALE), List.of("C#","Java","Python"));
        Programmer programmer3 = new Programmer(new Person("Jan","Kowalski",40,Gender.MALE), List.of("Pascal","Python"));
        itCompany.addProgrammerToCompany(programmer1);
        itCompany.addProgrammerToCompany(programmer2);
        itCompany.addProgrammerToCompany(programmer3);
        //when
        List<Programmer> result = itCompany.getMaleProgrammers();
        //then
        assertThat(result).containsExactly(programmer1,programmer3);
    }

    @Test
    void shouldReturnListOfProgrammersUnder18ProgrammingInJava(){
        //given
        Programmer programmer1 = new Programmer(new Person("Piotr","Migaj",30,Gender.MALE), List.of("C#","Java","Python"));
        Programmer programmer2 = new Programmer(new Person("Anna","Migaj",30,Gender.FEMALE), List.of("C#","Java","Python"));
        Programmer programmer3 = new Programmer(new Person("Jan","Kowalski",40,Gender.MALE), List.of("Pascal","Python"));
        Programmer programmer4 = new Programmer(new Person("Jan","Umber",17,Gender.MALE), List.of("Pascal","Python"));
        Programmer programmer5 = new Programmer(new Person("Anna","Umber",17,Gender.MALE), List.of("Pascal","Python","Java"));
        Programmer programmer6 = new Programmer(new Person("Maria","Umber",16,Gender.MALE), List.of("c#","Python","JAVA"));
        itCompany.addProgrammerToCompany(programmer1);
        itCompany.addProgrammerToCompany(programmer2);
        itCompany.addProgrammerToCompany(programmer3);
        itCompany.addProgrammerToCompany(programmer4);
        itCompany.addProgrammerToCompany(programmer5);
        itCompany.addProgrammerToCompany(programmer6);
        //when
        List<Programmer> result = itCompany.getProgrammersUnder18ProgrammingJava();
        //then
        assertThat(result).containsExactly(programmer5,programmer6);
    }

    @Test
    void shouldReturnListOfProgrammersWhoKnowsMoreThanOneLanguage(){
        //given
        Programmer programmer1 = new Programmer(new Person("Piotr","Migaj",30,Gender.MALE), List.of("C#","Java","Python"));
        Programmer programmer2 = new Programmer(new Person("Anna","Migaj",30,Gender.FEMALE), List.of("C#","Java","Python"));
        Programmer programmer3 = new Programmer(new Person("Jan","Kowalski",40,Gender.MALE), List.of("Pascal","Python"));
        Programmer programmer4 = new Programmer(new Person("Jan","Umber",17,Gender.MALE), List.of("Pascal","Python"));
        Programmer programmer5 = new Programmer(new Person("Anna","Umber",17,Gender.MALE), List.of("Pascal","Python","Java"));
        Programmer programmer6 = new Programmer(new Person("Maria","Umber",16,Gender.MALE), List.of("c#","Python","JAVA"));
        Programmer programmer7 = new Programmer(new Person("Maria","Umber",16,Gender.MALE), List.of("c++"));
        itCompany.addProgrammerToCompany(programmer1);
        itCompany.addProgrammerToCompany(programmer2);
        itCompany.addProgrammerToCompany(programmer3);
        itCompany.addProgrammerToCompany(programmer4);
        itCompany.addProgrammerToCompany(programmer5);
        itCompany.addProgrammerToCompany(programmer6);
        itCompany.addProgrammerToCompany(programmer7);
        //when
        List<Programmer> result = itCompany.getProgrammersWhoKnowsMoreThanOneProgrammingLanguage();
        //then
        assertThat(result).containsExactly(programmer1,programmer2,programmer3,programmer4,programmer5,programmer6);
        assertThat(result).hasSize(6);
    }

    @Test
    void shouldReturnListOfFemaleProgrammersWhoKnowsJavaAndCSharp(){
        //given
        Programmer programmer1 = new Programmer(new Person("Piotr","Migaj",30,Gender.MALE), List.of("C#","Java","Python"));
        Programmer programmer2 = new Programmer(new Person("Anna","Migaj",30,Gender.FEMALE), List.of("C#","Java","Python"));
        Programmer programmer3 = new Programmer(new Person("Jan","Kowalski",40,Gender.MALE), List.of("Pascal","Python"));
        Programmer programmer4 = new Programmer(new Person("Jan","Umber",17,Gender.MALE), List.of("Pascal","Python"));
        Programmer programmer5 = new Programmer(new Person("Anna","Umber",17,Gender.FEMALE), List.of("Pascal","Python","Java"));
        Programmer programmer6 = new Programmer(new Person("Maria","Umber",16,Gender.FEMALE), List.of("c#","Python","JAVA"));
        Programmer programmer7 = new Programmer(new Person("Maria","Umber",16,Gender.FEMALE), List.of("c++"));
        itCompany.addProgrammerToCompany(programmer1);
        itCompany.addProgrammerToCompany(programmer2);
        itCompany.addProgrammerToCompany(programmer3);
        itCompany.addProgrammerToCompany(programmer4);
        itCompany.addProgrammerToCompany(programmer5);
        itCompany.addProgrammerToCompany(programmer6);
        itCompany.addProgrammerToCompany(programmer7);
        //when
        List<Programmer> result = itCompany.getFemaleProgrammersWhoKnowsJavaAndCsharp();
        //then
        assertThat(result).containsExactly(programmer2,programmer6);
        assertThat(result).hasSize(2);
    }

    @Test
    void shouldReturnListOfNamesOfMaleProgrammers(){
        //given
        Programmer programmer1 = new Programmer(new Person("Piotr","Migaj",30,Gender.MALE), List.of("C#","Java","Python"));
        Programmer programmer2 = new Programmer(new Person("Anna","Migaj",30,Gender.FEMALE), List.of("C#","Java","Python"));
        Programmer programmer3 = new Programmer(new Person("Jan","Kowalski",40,Gender.MALE), List.of("Pascal","Python"));
        Programmer programmer4 = new Programmer(new Person("Jan","Umber",17,Gender.MALE), List.of("Pascal","Python"));
        Programmer programmer5 = new Programmer(new Person("Anna","Umber",17,Gender.FEMALE), List.of("Pascal","Python","Java"));
        Programmer programmer6 = new Programmer(new Person("Maria","Umber",16,Gender.FEMALE), List.of("c#","Python","JAVA"));
        Programmer programmer7 = new Programmer(new Person("Maria","Umber",16,Gender.FEMALE), List.of("c++"));
        itCompany.addProgrammerToCompany(programmer1);
        itCompany.addProgrammerToCompany(programmer2);
        itCompany.addProgrammerToCompany(programmer3);
        itCompany.addProgrammerToCompany(programmer4);
        itCompany.addProgrammerToCompany(programmer5);
        itCompany.addProgrammerToCompany(programmer6);
        itCompany.addProgrammerToCompany(programmer7);
        //when
        List<String> result = itCompany.getNamesOfMaleProgrammers();
        //then
        assertThat(result).containsExactly("Piotr","Jan","Jan");
        assertThat(result).hasSize(3);
    }

    @Test
    void shouldReturnSetOfProgrammingLanguagesKnownByProgrammers(){
        //given
        Programmer programmer1 = new Programmer(new Person("Piotr","Migaj",30,Gender.MALE), List.of("C#","Java","Python"));
        Programmer programmer2 = new Programmer(new Person("Anna","Migaj",30,Gender.FEMALE), List.of("C#","Java","Python"));
        Programmer programmer3 = new Programmer(new Person("Jan","Kowalski",40,Gender.MALE), List.of("Pascal","Python"));
        Programmer programmer4 = new Programmer(new Person("Jan","Umber",17,Gender.MALE), List.of("Pascal","Python"));
        Programmer programmer5 = new Programmer(new Person("Anna","Umber",17,Gender.FEMALE), List.of("Pascal","Python","Java"));
        Programmer programmer6 = new Programmer(new Person("Maria","Umber",16,Gender.FEMALE), List.of("c#","Python","JAVA"));
        Programmer programmer7 = new Programmer(new Person("Maria","Umber",16,Gender.FEMALE), List.of("c++"));
        itCompany.addProgrammerToCompany(programmer1);
        itCompany.addProgrammerToCompany(programmer2);
        itCompany.addProgrammerToCompany(programmer3);
        itCompany.addProgrammerToCompany(programmer4);
        itCompany.addProgrammerToCompany(programmer5);
        itCompany.addProgrammerToCompany(programmer6);
        itCompany.addProgrammerToCompany(programmer7);
        //when
        Set<String> result = itCompany.getAllLanguagesKnownByProgrammers();
        //then
        assertThat(result).containsExactlyInAnyOrder("c#","java","python","pascal","c++");
        assertThat(result).hasSize(5);
    }

    @Test
    void shouldReturnListOfLastnamesOfProgrammersWhoKnowsMoreThanTwoLanguages(){
        //given
        Programmer programmer1 = new Programmer(new Person("Piotr","Migaj",30,Gender.MALE), List.of("C#","Java","Python"));
        Programmer programmer2 = new Programmer(new Person("Anna","Migaj",30,Gender.FEMALE), List.of("C#","Java","Python"));
        Programmer programmer3 = new Programmer(new Person("Jan","Kowalski",40,Gender.MALE), List.of("Pascal","Python"));
        Programmer programmer4 = new Programmer(new Person("Jan","Umber",17,Gender.MALE), List.of("Pascal","Python"));
        Programmer programmer5 = new Programmer(new Person("Anna","Umber",17,Gender.FEMALE), List.of("Pascal","Python","Java"));
        Programmer programmer6 = new Programmer(new Person("Maria","Umber",16,Gender.FEMALE), List.of("c#","Python","JAVA"));
        Programmer programmer7 = new Programmer(new Person("Maria","Umber",16,Gender.FEMALE), List.of("c++"));
        itCompany.addProgrammerToCompany(programmer1);
        itCompany.addProgrammerToCompany(programmer2);
        itCompany.addProgrammerToCompany(programmer3);
        itCompany.addProgrammerToCompany(programmer4);
        itCompany.addProgrammerToCompany(programmer5);
        itCompany.addProgrammerToCompany(programmer6);
        itCompany.addProgrammerToCompany(programmer7);
        //when
        List<String> result = itCompany.getLastnamesOfProgrammersWhoKnowsMoreThanTwoLanguages();
        //then
        assertThat(result).containsExactly("Migaj");
        assertThat(result).hasSize(1);
    }

    @Test
    void shouldReturnTrueIfThereIsAPersonWhoDoesntKnowAnyLanguage(){
        //given
        Programmer programmer1 = new Programmer(new Person("Piotr","Migaj",30,Gender.MALE), List.of("C#","Java","Python"));
        Programmer programmer2 = new Programmer(new Person("Anna","Migaj",30,Gender.FEMALE), List.of("C#","Java","Python"));
        Programmer programmer3 = new Programmer(new Person("Jan","Kowalski",40,Gender.MALE), List.of("Pascal","Python"));
        Programmer programmer4 = new Programmer(new Person("Jan","Umber",17,Gender.MALE), List.of("Pascal","Python"));
        Programmer programmer5 = new Programmer(new Person("Anna","Umber",17,Gender.FEMALE), List.of("Pascal","Python","Java"));
        Programmer programmer6 = new Programmer(new Person("Maria","Umber",16,Gender.FEMALE), List.of("c#","Python","JAVA"));
        Programmer programmer7 = new Programmer(new Person("Maria","Umber",16,Gender.FEMALE), List.of("c++"));
        Programmer programmer8 = new Programmer(new Person("Kasia","Pelasia",18,Gender.FEMALE), List.of());
        itCompany.addProgrammerToCompany(programmer1);
        itCompany.addProgrammerToCompany(programmer2);
        itCompany.addProgrammerToCompany(programmer3);
        itCompany.addProgrammerToCompany(programmer4);
        itCompany.addProgrammerToCompany(programmer5);
        itCompany.addProgrammerToCompany(programmer6);
        itCompany.addProgrammerToCompany(programmer7);
        itCompany.addProgrammerToCompany(programmer8);
        //when
        boolean result = itCompany.ifThereIsAPersonWhoDoesntKnowAnyLanguage();
        //then
        assertThat(result).isTrue();
    }

}