package pl.migibud.workbook.test3decorator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ProcessMsg implements Message {

    private static final String DODATKOWY_TEKST = " dodatkowy tekst";
    private Message msgClass;

    @Override
    public String getText() {
        return msgClass.getText()+DODATKOWY_TEKST;
    }
}
