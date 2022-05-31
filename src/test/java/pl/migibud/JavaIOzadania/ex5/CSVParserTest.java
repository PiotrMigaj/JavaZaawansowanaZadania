package pl.migibud.JavaIOzadania.ex5;

import org.assertj.core.api.ThrowableAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class CSVParserTest {

    private Parsable csvParse;

    @BeforeEach
    void setUp(){
        csvParse = new CSVParser();
    }

    @Test
    void shouldParseSingleLineOfCSVStringToUserObject(){
        //given
        String inputData = "John,Smith,23";
        //when
        User result = csvParse.parseSingleLine(inputData);
        User expectedUser = new User("John","Smith",23);
        //then
        assertThat(result).isEqualTo(expectedUser);
    }



}