package coding.dojo.elephantcarpaccio;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CommandCalculatorTest {

    @Test
    public void purchase_command_500_and_state_NY() throws Exception {
        CommandCalculator commandCalculator = new CommandCalculator();
        Assertions.assertThat(commandCalculator.calculate(50, 3, CommandCalculator.TvaState.NONE)).isEqualTo(50 * 3);
    }

    @Test
    public void purchase_command_1500() throws Exception {
        CommandCalculator commandCalculator = new CommandCalculator();
        Assertions.assertThat(commandCalculator.calculate(5, 30, CommandCalculator.TvaState.UT)).isEqualTo(5 * 30 * 1.0685);
    }
}
