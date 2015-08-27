// automatically generated, do not modify

package in.co.ophio.flatbuffertest.model.person;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

public final class Person extends Table {
  public static Person getRootAsPerson(ByteBuffer _bb) { return getRootAsPerson(_bb, new Person()); }
  public static Person getRootAsPerson(ByteBuffer _bb, Person obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public Person __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public long id() { int o = __offset(4); return o != 0 ? bb.getLong(o + bb_pos) : 0; }
  public String fName() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer fNameAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public String lName() { int o = __offset(8); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer lNameAsByteBuffer() { return __vector_as_bytebuffer(8, 1); }
  public String email() { int o = __offset(10); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer emailAsByteBuffer() { return __vector_as_bytebuffer(10, 1); }
  public Person friends(int j) { return friends(new Person(), j); }
  public Person friends(Person obj, int j) { int o = __offset(12); return o != 0 ? obj.__init(__indirect(__vector(o) + j * 4), bb) : null; }
  public int friendsLength() { int o = __offset(12); return o != 0 ? __vector_len(o) : 0; }
  public String address() { int o = __offset(14); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer addressAsByteBuffer() { return __vector_as_bytebuffer(14, 1); }
  public String bigaddress() { int o = __offset(16); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer bigaddressAsByteBuffer() { return __vector_as_bytebuffer(16, 1); }

  public static int createPerson(FlatBufferBuilder builder,
      long id,
      int fName,
      int lName,
      int email,
      int friends,
      int address,
      int bigaddress) {
    builder.startObject(7);
    Person.addId(builder, id);
    Person.addBigaddress(builder, bigaddress);
    Person.addAddress(builder, address);
    Person.addFriends(builder, friends);
    Person.addEmail(builder, email);
    Person.addLName(builder, lName);
    Person.addFName(builder, fName);
    return Person.endPerson(builder);
  }

  public static void startPerson(FlatBufferBuilder builder) { builder.startObject(7); }
  public static void addId(FlatBufferBuilder builder, long id) { builder.addLong(0, id, 0); }
  public static void addFName(FlatBufferBuilder builder, int fNameOffset) { builder.addOffset(1, fNameOffset, 0); }
  public static void addLName(FlatBufferBuilder builder, int lNameOffset) { builder.addOffset(2, lNameOffset, 0); }
  public static void addEmail(FlatBufferBuilder builder, int emailOffset) { builder.addOffset(3, emailOffset, 0); }
  public static void addFriends(FlatBufferBuilder builder, int friendsOffset) { builder.addOffset(4, friendsOffset, 0); }
  public static int createFriendsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startFriendsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addAddress(FlatBufferBuilder builder, int addressOffset) { builder.addOffset(5, addressOffset, 0); }
  public static void addBigaddress(FlatBufferBuilder builder, int bigaddressOffset) { builder.addOffset(6, bigaddressOffset, 0); }
  public static int endPerson(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

