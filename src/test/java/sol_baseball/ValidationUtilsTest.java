package sol_baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ValidationUtilsTest {

    @Test
    @DisplayName("ballCountValidationTest")
    void ballCountValidationTest (){

        Assertions.assertThat(ValidationUtils.validNo(9)).isTrue();
        Assertions.assertThat(ValidationUtils.validNo(1)).isTrue();
        Assertions.assertThat(ValidationUtils.validNo(10)).isFalse();
        Assertions.assertThat(ValidationUtils.validNo(0)).isFalse();
    }
}
