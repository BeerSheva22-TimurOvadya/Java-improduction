import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class MatricesTest {
	@Test
	void transpTest() {
		int[][] matrix1 = {
				{1, 2},
				{3, 4},
				{4, 5}
		};
		int expected1[][] = {
				{1, 3, 4},
				{2, 4, 5}
		};
		assertArrayEquals(expected1, Matrices.transp(matrix1));
		
		int[][] matrix2 = {
				{1, 2, -5, 7, 9, 7},
				{3, 4, 8, 6, 1},
				{8, 4, 5, 9,},
				{1},
				{1, -7, 9, 5, 4, 3}
		};
		int expected2[][] = {
				{1, 3, 8, 1, 1},
				{2, 4, 4, 0, -7},
				{-5, 8, 5, 0, 9},
				{7, 6, 9, 0, 5},
				{9, 1, 0, 0, 4},
				{7, 0, 0, 0, 3}
		};
		assertArrayEquals(expected2, Matrices.transp(matrix2));
	}

	
	
}
