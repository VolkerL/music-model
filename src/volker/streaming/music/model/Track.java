package volker.streaming.music.model;

/*
 * #%L
 * music-model
 * %%
 * Copyright (C) 2013 - 2014 Volker Lanting
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as 
 * published by the Free Software Foundation, either version 3 of the 
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public 
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-3.0.html>.
 * #L%
 */

import static volker.streaming.util.EqualsUtil.nullEquals;

public class Track {
	
	private String artist;
	private String name;
	private String album;
    private boolean nowPlaying;
	
	public Track() {
		this(null, null, null, false);
	}
	public Track(String artist, String name, String album, boolean nowPlaying) {
		this.artist = artist;
		this.name = name;
		this.album = album;
		this.nowPlaying = nowPlaying;
	}
	
	public boolean contentEquals(Track other) {
		return other != null
				&& nullEquals(getArtist(), other.getArtist())
				&& nullEquals(getAlbum(), other.getAlbum())
				&& nullEquals(getName(), other.getName())
				&& nullEquals(isNowPlaying(), other.isNowPlaying());
	}
	
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	
	public boolean isNowPlaying() {
		return nowPlaying;
	}
	public void setNowPlaying(boolean bool) {
		nowPlaying = bool;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append('{')
			.append("\"artist\" : \"").append(getArtist()).append("\", ")
			.append("\"name\" : \"").append(getName()).append("\", ")
			.append("\"album\" : \"").append(getAlbum()).append("\", ")
			.append("\"nowPlaying\" : \"").append(isNowPlaying())
			.append('}');
		return builder.toString();
	}
}
