package test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Investment.*;

class test{
    @Test
    public void invest_roi_PositiveParams()
    {
        assert(1523.6, Investment.invest(1300,4,4.3));
    }

    @Test
    public void invest_roi_PositiveParams()
    {
        assert(4688.0, Investment.invest(4000,4,4.3));
    }

    @Test
    public void invest_roi_PositiveParams()
    {
        assert(4688.0, Investment.invest(3500,4,4.3));
    }
    @Test
    public void invest_roi_PositiveParams()
    {
        assert(4688.0, Investment.invest(3000,4,4.3));
    }
    @Test
    public void invest_roi_PositiveParams()
    {
        assert(4688.0, Investment.invest(2500,4,4.3));
    }
    @Test
    public void invest_roi_PositiveParams()
    {
        assert(4688.0, Investment.invest(2000,4,4.3));
    }

}