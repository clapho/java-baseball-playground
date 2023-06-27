package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split() {
        String str = "1,2";
        String str2 = "1";
        String[] arr = str.split(",");
        String[] arr2 = str2.split(",");

        assertThat(arr).contains("1", "2");
        assertThat(arr2).containsExactly("1");
    }

    @Test
    void subString() {
        String str = "(1,2)";
        String result = str.substring(1, str.length()-1);

        assertThat(result).isEqualTo("1,2");
    }

    @Test
    @DisplayName("입력값 범위 밖일 경우 StringIndexOutOfBoundsException 확인")
    void charAt() {
        String str = "abc";

        assertThatThrownBy(() -> str.charAt(str.length()))
                .isInstanceOf(StringIndexOutOfBoundsException.class)
                .hasMessageContaining("String index out of range")
                .hasMessageContaining(String.valueOf(str.length()));
    }
}
