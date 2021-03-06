package utils;

import java.awt.Point;

public class Edge {
	private Point from, to;
	
	public Edge(Point from, Point to) {
		this.from = from;
		this.to = to;
	}

	public Point getFrom() {
		return from;
	}

	public Point getTo() {
		return to;
	}

	public void setFrom(Point from) {
		this.from = from;
	}

	public void setTo(Point to) {
		this.to = to;
	}
	
	@Override
	public String toString() {
		return "Edge from " + this.getFrom().x + " " + this.getFrom().y + " to " + this.getTo().x + " " + this.getTo().y;
	};

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((from == null) ? 0 : from.hashCode());
		result = prime * result + ((to == null) ? 0 : to.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Edge other = (Edge) obj;
		if (from == null) {
			if (other.from != null)
				return false;
		} else if (!from.equals(other.from))
			return false;
		if (to == null) {
			if (other.to != null)
				return false;
		} else if (!to.equals(other.to))
			return false;
		return true;
	}
	
	public static void main(String[] args) {
		Point from = new Point(-5, 9);
		Point to = new Point(-5, 1);
		Edge e1 = new Edge(from, to);
		Edge e2 = new Edge(to, from);
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e1.equals(e2));
	}
}
