package map;

import java.awt.Point;
import java.util.List;
import java.util.Map;

import core.LocalVacuumEnvironmentPerceptTaskEnvironmentB;

public interface MapInterface {

	public enum Movement {
		left, down, right, up;
	}
	
	

	public List<Point> getUnexploredPoints();
	public boolean areWallsDetected();
	public List<Point> getAdjWalkablePoints(Point from);
	public Tile getCurrentPosition();
	public Point getCurrentPositionPoint();
	public boolean isVisited (Point p);
	public boolean isWall (Point p);
	public Tile getBase();
	public void setInitialTile(LocalVacuumEnvironmentPerceptTaskEnvironmentB vep);
	public void updateMap(LocalVacuumEnvironmentPerceptTaskEnvironmentB vep, Movement lastAction);
	public boolean isObstacle(Point p);
	public int manatthanDistance(Point from, Point to);
	public double eucladianDistance(Point from, Point to);
	public boolean isCompletelyExplored();
	public void setTile(Tile t);
	public double percentExplored();
	public Point getNearestUnexplored(Point p);
	
	public int getCols();
	public int getRows();
	public Map<Point, Tile> getMap();
}
