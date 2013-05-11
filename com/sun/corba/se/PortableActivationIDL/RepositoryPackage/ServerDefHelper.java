package com.sun.corba.se.PortableActivationIDL.RepositoryPackage;


/**
* com/sun/corba/se/PortableActivationIDL/RepositoryPackage/ServerDefHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../../src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Wednesday, November 14, 2012 2:24:35 AM PST
*/

abstract public class ServerDefHelper
{
  private static String  _id = "IDL:PortableActivationIDL/Repository/ServerDef:1.0";

  public static void insert (org.omg.CORBA.Any a, com.sun.corba.se.PortableActivationIDL.RepositoryPackage.ServerDef that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static com.sun.corba.se.PortableActivationIDL.RepositoryPackage.ServerDef extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [6];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "applicationName",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "serverName",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[2] = new org.omg.CORBA.StructMember (
            "serverClassPath",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[3] = new org.omg.CORBA.StructMember (
            "serverArgs",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[4] = new org.omg.CORBA.StructMember (
            "serverVmArgs",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_boolean);
          _members0[5] = new org.omg.CORBA.StructMember (
            "isInstalled",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (com.sun.corba.se.PortableActivationIDL.RepositoryPackage.ServerDefHelper.id (), "ServerDef", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static com.sun.corba.se.PortableActivationIDL.RepositoryPackage.ServerDef read (org.omg.CORBA.portable.InputStream istream)
  {
    com.sun.corba.se.PortableActivationIDL.RepositoryPackage.ServerDef value = new com.sun.corba.se.PortableActivationIDL.RepositoryPackage.ServerDef ();
    value.applicationName = istream.read_string ();
    value.serverName = istream.read_string ();
    value.serverClassPath = istream.read_string ();
    value.serverArgs = istream.read_string ();
    value.serverVmArgs = istream.read_string ();
    value.isInstalled = istream.read_boolean ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, com.sun.corba.se.PortableActivationIDL.RepositoryPackage.ServerDef value)
  {
    ostream.write_string (value.applicationName);
    ostream.write_string (value.serverName);
    ostream.write_string (value.serverClassPath);
    ostream.write_string (value.serverArgs);
    ostream.write_string (value.serverVmArgs);
    ostream.write_boolean (value.isInstalled);
  }

}
