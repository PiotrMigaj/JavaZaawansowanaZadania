package pl.migibud.workbook.test3decorator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ProcessMsg2 implements Message {

    private static final String DODATKOWY_TEKST_2 = " dodatkowy tekst 2";
    private Message msgClass;

    @Override
    public String getText() {
        return msgClass.getText()+DODATKOWY_TEKST_2;
    }
}
