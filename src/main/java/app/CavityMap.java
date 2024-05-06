package app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CavityMap {

    public static void main(String[] args) {
        System.err.println(cavityMap(List.of("1112", "1912", "1892", "1234")));
    }

    public static List<String> cavityMap(List<String> grid) {
        List<String> cavity = new ArrayList<>(grid);

        for (int row = 1; row < grid.size() - 1; row++) {
            for (int column = 1; column < grid.size() - 1; column++) {

                char cell = grid.get(row).charAt(column);

                if (cell > grid.get(row).charAt(column - 1)
                        && cell > grid.get(row).charAt(column + 1)
                        && cell > grid.get(row - 1).charAt(column)
                        && cell > grid.get(row + 1).charAt(column)) {
                    cavity.set(row, cavity.get(row).substring(0, column) + "X" + cavity.get(row).substring(column + 1));
                }
            }
        }

        return cavity;
    }

}
