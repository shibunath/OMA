package com.Om.Left;

public class AccessControl {
	int ObjectID;
	int ObjectInstanceID;
	int ACL;
	int AccessControlOwner;
	
	public AccessControl(int a,int b,int c,int d)
	{
		this.ObjectID=a;
		this.ObjectInstanceID=b;
		this.ACL=c;
		this.AccessControlOwner=d;
	}
	
	public int getObjectID() {
		return ObjectID;
	}
	public void setObjectID(int objectID) {
		ObjectID = objectID;
	}
	public int getObjectInstanceID() {
		return ObjectInstanceID;
	}
	public void setObjectInstanceID(int objectInstanceID) {
		ObjectInstanceID = objectInstanceID;
	}
	public int getACL() {
		return ACL;
	}
	public void setACL(int aCL) {
		ACL = aCL;
	}
	public int getAccessControlOwner() {
		return AccessControlOwner;
	}
	public void setAccessControlOwner(int accessControlOwner) {
		AccessControlOwner = accessControlOwner;
	}
}
