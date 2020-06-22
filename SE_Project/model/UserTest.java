package org.mobileProgramming.maintermproject.model;
import junit.framework.TestCase;

public class UserTest extends TestCase {
    User test = new User();
    public void testSetMemo() {
        assertEquals(true, test.sizeMemo("안녕하세요"));
    }//사용자가 작성하는 메모의 사이즈가 15자 이하를 만족해야하는 테스트
    public void testhashtagNum() {
        assertEquals(true, test.hashtagNum("집사", "환영", "컴온"));
    } //사용자가 작성하는 해쉬테그의 갯수가 3개 이며 각각 빈공간이어서는 안된다
}


