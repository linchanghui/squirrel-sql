package net.sourceforge.squirrel_sql.plugins.laf;
/*
 * Copyright (C) 2001-2006 Colin Bell
 * colbell@users.sourceforge.net
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
/**
 * Plugin constants.
 *
 * @author  <A HREF="mailto:colbell@users.sourceforge.net">Colin Bell</A>
 */
public interface ILAFConstants
{
	/** Name of file to store user prefs in. */
	public static final String USER_PREFS_FILE_NAME = "LAFPrefs.xml";
	/* Name of directory to store extra LAFs in for the user. */
	public static final String USER_EXTRA_LAFS_FOLDER = "extralafs";
	/** Name of file that contains extra LAF definitions for the current user. */
	public static final String USER_EXTRA_LAFS_PROPS_FILE = "extralafs.properties";
}
