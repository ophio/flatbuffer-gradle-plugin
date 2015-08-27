// automatically generated, do not modify

package in.co.ophio.flatbuffertest.model.person;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

public final class PersonList extends Table {
  public static PersonList getRootAsPersonList(ByteBuffer _bb) { return getRootAsPersonList(_bb, new PersonList()); }
  public static PersonList getRootAsPersonList(ByteBuffer _bb, PersonList obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public PersonList __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public Person people(int j) { return people(new Person(), j); }
  public Person people(Person obj, int j) { int o = __offset(4); return o != 0 ? obj.__init(__indirect(__vector(o) + j * 4), bb) : null; }
  public int peopleLength() { int o = __offset(4); return o != 0 ? __vector_len(o) : 0; }

  public static int createPersonList(FlatBufferBuilder builder,
      int people) {
    builder.startObject(1);
    PersonList.addPeople(builder, people);
    return PersonList.endPersonList(builder);
  }

  public static void startPersonList(FlatBufferBuilder builder) { builder.startObject(1); }
  public static void addPeople(FlatBufferBuilder builder, int peopleOffset) { builder.addOffset(0, peopleOffset, 0); }
  public static int createPeopleVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startPeopleVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endPersonList(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
  public static void finishPersonListBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
};

