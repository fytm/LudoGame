package Ludo;
//48 moves to home each
public class Path {
	//x coordinates for path of each piece from start to yellow
	static int[][] ax = {
			//Path for Yellow
			//{1,2,3,4,5,5,5,5,5,6,7,7,7,7,7,8,9,10,11,12,12,12,11,10,9,8,7,7,7,7,7,6,5,5,5,5,5,4,3,2,1,0,0,1,2,3,4,5},
			{2, 3, 4, 5, 6, 6, 6, 6, 6, 7, 8, 8, 8, 8, 8, 9, 10, 11, 12, 13, 13, 13, 12, 11, 10, 9, 8, 8, 8, 8, 8, 7, 6, 6, 6, 6, 6, 5, 4, 3, 2, 1, 1, 2, 3, 4, 5, 6},

			//Path for Blue
			//{7,7,7,7,8,9,10,11,12,12,12,11,10,9,8,7,7,7,7,7,6,5,5,5,5,5,4,3,2,1,0,0,0,1,2,3,4,5,5,5,5,5,6,6,6,6,6,6},
			{8, 8, 8, 8, 9, 10, 11, 12, 13, 13, 13, 12, 11, 10, 9, 8, 8, 8, 8, 8, 7, 6, 6, 6, 6, 6, 5, 4, 3, 2, 1, 1, 1, 2, 3, 4, 5, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7},

			//Path for Green
			//{11,10,9,8,7,7,7,7,7,6,5,5,5,5,5,4,3,2,1,0,0,0,1,2,3,4,5,5,5,5,5,6,7,7,7,7,7,8,9,10,11,12,12,11,10,9,8,7},
			{12, 11, 10, 9, 8, 8, 8, 8, 8, 7, 6, 6, 6, 6, 6, 5, 4, 3, 2, 1, 1, 1, 2, 3, 4, 5, 6, 6, 6, 6, 6, 7, 8, 8, 8, 8, 8, 9, 10, 11, 12, 13, 13, 12, 11, 10, 9, 8},

			//Path for Red
			//{5,5,5,5,4,3,2,1,0,0,0,1,2,3,4,5,5,5,5,5,6,7,7,7,7,7,8,9,10,11,12,12,12,11,10,9,8,7,7,7,7,7,6,6,6,6,6,6}
			{6, 6, 6, 6, 5, 4, 3, 2, 1, 1, 1, 2, 3, 4, 5, 6, 6, 6, 6, 6, 7, 8, 8, 8, 8, 8, 9, 10, 11, 12, 13, 13, 13, 12, 11, 10, 9, 8, 8, 8, 8, 8, 7, 7, 7, 7, 7, 7},
	};

	//y coordinates for path of each piece from start to yellow
	static int[][] ay = {
			//Path for Yellow
			//{5,5,5,5,4,3,2,1,0,0,0,1,2,3,4,5,5,5,5,5,6,7,7,7,7,7,8,9,10,11,12,12,12,11,10,9,8,7,7,7,7,7,6,6,6,6,6,6},
			{6, 6, 6, 6, 5, 4, 3, 2, 1, 1, 1, 2, 3, 4, 5, 6, 6, 6, 6, 6, 7, 8, 8, 8, 8, 8, 9, 10, 11, 12, 13, 13, 13, 12, 11, 10, 9, 8, 8, 8, 8, 8, 7, 7, 7, 7, 7, 7},

			//Path for Blue
			//{1,2,3,4,5,5,5,5,5,6,7,7,7,7,7,8,9,10,11,12,12,12,11,10,9,8,7,7,7,7,7,6,5,5,5,5,5,4,3,2,1,0,0,1,2,3,4,5},
			{2, 3, 4, 5, 6, 6, 6, 6, 6, 7, 8, 8, 8, 8, 8, 9, 10, 11, 12, 13, 13, 13, 12, 11, 10, 9, 8, 8, 8, 8, 8, 7, 6, 6, 6, 6, 6, 5, 4, 3, 2, 1, 1, 2, 3, 4, 5, 6},

			//Path for Green
			//{7,7,7,7,8,9,10,11,12,12,12,11,10,9,8,7,7,7,7,7,6,5,5,5,5,5,4,3,2,1,0,0,0,1,2,3,4,5,5,5,5,5,6,6,6,6,6,6},
			{8, 8, 8, 8, 9, 10, 11, 12, 13, 13, 13, 12, 11, 10, 9, 8, 8, 8, 8, 8, 7, 6, 6, 6, 6, 6, 5, 4, 3, 2, 1, 1, 1, 2, 3, 4, 5, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7},

			//Path for Red
			//{11,10,9,8,7,7,7,7,7,6,5,5,5,5,5,4,3,2,1,0,0,0,1,2,3,4,5,5,5,5,5,6,7,7,7,7,7,8,9,10,11,12,12,11,10,9,8,7},
			{12, 11, 10, 9, 8, 8, 8, 8, 8, 7, 6, 6, 6, 6, 6, 5, 4, 3, 2, 1, 1, 1, 2, 3, 4, 5, 6, 6, 6, 6, 6, 7, 8, 8, 8, 8, 8, 9, 10, 11, 12, 13, 13, 12, 11, 10, 9, 8},

	};

	//x coordinates for starting position of each piece
	static int[][] initialx = {
			{1, 1, 3, 3},
			{10, 10, 12, 12},
			{10, 10, 12, 12},
			{1, 1, 3, 3}
	};
	//y coordinates for starting position of each piece
	static int[][] initialy = {
			{1, 3, 1, 3},
			{1, 3, 1, 3},
			{10, 12, 10, 12},
			{10, 12, 10, 12}
	};


}
