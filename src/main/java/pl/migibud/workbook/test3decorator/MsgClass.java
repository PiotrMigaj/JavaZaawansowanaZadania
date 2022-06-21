package pl.migibud.workbook.test3decorator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class MsgClass implements Message {

    private String text;

    @Override
    public String getText() {
        return text;
    }

}
