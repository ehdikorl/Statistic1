import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

import static org.junit.jupiter.api.Assertions.assertEquals;


class StatsServiceTest {
    @Test
    void shouldCalculateSumSales() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calculateSumSales(sale);
        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateAverageSum() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.calculateAverageSum(sale);
        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateMaxSale() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.calculateMaxSales(sale);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMinSale() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 13;

        int actual = service.calculateMinSales(sale);
        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateMediumQuantityMonthMin() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.calculateMediumQuantityMonthMin(sale);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMediumQuantityMonthMax() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.calculateMediumQuantityMonthMin(sale);
        assertEquals(expected, actual);
    }
}
