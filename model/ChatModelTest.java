package org.mobileProgramming.maintermproject.model;

import junit.framework.TestCase;

public class ChatModelTest extends TestCase {
    ChatModel test = new ChatModel();
    public void testMessageOkay() {
        assertEquals(false, test.messageOkay(null));
    } //채팅을 보낼때의 모델이 null값이 들어가면 안된다
}





