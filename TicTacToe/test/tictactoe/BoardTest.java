/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package tictactoe;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author masha
 */
public class BoardTest {
    
     private Board board;

    @Before
    public void setup() {
        board = new Board();
    }

    @Test
    public void testInitializeBoard() {
        board.initializeBoard();
        char[][] expectedBoard = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
        };
        assertArrayEquals(expectedBoard, board.getBoard());
    }

    @Test
    public void testPlaceMark() {
        assertTrue(board.placeMark(0, 0));
        assertEquals('X', board.getBoard()[0][0]);
        board.changePlayer();
        assertTrue(board.placeMark(1, 1));
        assertEquals('O', board.getBoard()[1][1]);
    }

    @Test
    public void testCheckForWin() {
        board.placeMark(0, 0);
        board.placeMark(0, 1);
        board.placeMark(0, 2);
        assertTrue(board.checkForWin());
    }

    @Test
    public void testIsBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board.placeMark(i, j);
                board.changePlayer();
            }
        }
        assertTrue(board.isBoardFull());
    }
    
}
