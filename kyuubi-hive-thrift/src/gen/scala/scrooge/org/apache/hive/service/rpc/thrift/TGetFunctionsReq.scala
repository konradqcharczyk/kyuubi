/**
 * Generated by Scrooge
 *   version: 19.12.0
 *   rev: dfdb68cf6b9c501dbbe3ae644504bf403ad76bfa
 *   built at: 20191212-171820
 */
package org.apache.hive.service.rpc.thrift

import com.twitter.io.Buf
import com.twitter.scrooge.{
  InvalidFieldsException,
  LazyTProtocol,
  StructBuilder,
  StructBuilderFactory,
  TFieldBlob,
  ThriftStruct,
  ThriftStructCodec3,
  ThriftStructField,
  ThriftStructFieldInfo,
  ThriftStructMetaData,
  ValidatingThriftStruct,
  ValidatingThriftStructCodec3
}
import org.apache.thrift.protocol._
import org.apache.thrift.transport.TMemoryBuffer
import scala.collection.immutable.{Map => immutable$Map}
import scala.collection.mutable.Builder
import scala.reflect.{ClassTag, classTag}


object TGetFunctionsReq extends ValidatingThriftStructCodec3[TGetFunctionsReq] with StructBuilderFactory[TGetFunctionsReq] {
  val NoPassthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty[Short, TFieldBlob]
  val Struct: TStruct = new TStruct("TGetFunctionsReq")
  val SessionHandleField: TField = new TField("sessionHandle", TType.STRUCT, 1)
  val SessionHandleFieldManifest: Manifest[org.apache.hive.service.rpc.thrift.TSessionHandle] = implicitly[Manifest[org.apache.hive.service.rpc.thrift.TSessionHandle]]
  val CatalogNameField: TField = new TField("catalogName", TType.STRING, 2)
  val CatalogNameFieldManifest: Manifest[String] = implicitly[Manifest[String]]
  val SchemaNameField: TField = new TField("schemaName", TType.STRING, 3)
  val SchemaNameFieldManifest: Manifest[String] = implicitly[Manifest[String]]
  val FunctionNameField: TField = new TField("functionName", TType.STRING, 4)
  val FunctionNameFieldManifest: Manifest[String] = implicitly[Manifest[String]]

  /**
   * Field information in declaration order.
   */
  lazy val fieldInfos: scala.List[ThriftStructFieldInfo] = scala.List[ThriftStructFieldInfo](
    new ThriftStructFieldInfo(
      SessionHandleField,
      false,
      true,
      SessionHandleFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    ),
    new ThriftStructFieldInfo(
      CatalogNameField,
      true,
      false,
      CatalogNameFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    ),
    new ThriftStructFieldInfo(
      SchemaNameField,
      true,
      false,
      SchemaNameFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    ),
    new ThriftStructFieldInfo(
      FunctionNameField,
      false,
      true,
      FunctionNameFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    )
  )

  lazy val structAnnotations: immutable$Map[String, String] =
    immutable$Map.empty[String, String]

  private val fieldTypes: IndexedSeq[ClassTag[_]] = IndexedSeq(
    classTag[org.apache.hive.service.rpc.thrift.TSessionHandle].asInstanceOf[ClassTag[_]],
    classTag[_root_.scala.Option[String]].asInstanceOf[ClassTag[_]],
    classTag[_root_.scala.Option[String]].asInstanceOf[ClassTag[_]],
    classTag[String].asInstanceOf[ClassTag[_]]
  )

  private[this] val structFields: Seq[ThriftStructField[TGetFunctionsReq]] = {
    Seq(
      new ThriftStructField[TGetFunctionsReq](
        SessionHandleField,
        _root_.scala.Some(SessionHandleFieldManifest),
        classOf[TGetFunctionsReq]) {
          def getValue[R](struct: TGetFunctionsReq): R = struct.sessionHandle.asInstanceOf[R]
      },
      new ThriftStructField[TGetFunctionsReq](
        CatalogNameField,
        _root_.scala.Some(CatalogNameFieldManifest),
        classOf[TGetFunctionsReq]) {
          def getValue[R](struct: TGetFunctionsReq): R = struct.catalogName.asInstanceOf[R]
      },
      new ThriftStructField[TGetFunctionsReq](
        SchemaNameField,
        _root_.scala.Some(SchemaNameFieldManifest),
        classOf[TGetFunctionsReq]) {
          def getValue[R](struct: TGetFunctionsReq): R = struct.schemaName.asInstanceOf[R]
      },
      new ThriftStructField[TGetFunctionsReq](
        FunctionNameField,
        _root_.scala.Some(FunctionNameFieldManifest),
        classOf[TGetFunctionsReq]) {
          def getValue[R](struct: TGetFunctionsReq): R = struct.functionName.asInstanceOf[R]
      }
    )
  }

  override lazy val metaData: ThriftStructMetaData[TGetFunctionsReq] =
    new ThriftStructMetaData(this, structFields, fieldInfos, Seq(), structAnnotations)

  /**
   * Checks that all required fields are non-null.
   */
  def validate(_item: TGetFunctionsReq): Unit = {
    if (_item.sessionHandle == null) throw new TProtocolException("Required field sessionHandle cannot be null")
    if (_item.functionName == null) throw new TProtocolException("Required field functionName cannot be null")
  }

  /**
   * Checks that the struct is a valid as a new instance. If there are any missing required or
   * construction required fields, return a non-empty list.
   */
  def validateNewInstance(item: TGetFunctionsReq): scala.Seq[com.twitter.scrooge.validation.Issue] = {
    val buf = scala.collection.mutable.ListBuffer.empty[com.twitter.scrooge.validation.Issue]

    if (item.sessionHandle == null)
      buf += com.twitter.scrooge.validation.MissingRequiredField(fieldInfos.apply(0))
    buf ++= validateField(item.sessionHandle)
    buf ++= validateField(item.catalogName)
    buf ++= validateField(item.schemaName)
    if (item.functionName == null)
      buf += com.twitter.scrooge.validation.MissingRequiredField(fieldInfos.apply(3))
    buf ++= validateField(item.functionName)
    buf.toList
  }

  def withoutPassthroughFields(original: TGetFunctionsReq): TGetFunctionsReq =
    new Immutable(
      sessionHandle =
        {
          val field = original.sessionHandle
          org.apache.hive.service.rpc.thrift.TSessionHandle.withoutPassthroughFields(field)
        },
      catalogName =
        {
          val field = original.catalogName
          field.map { field =>
            field
          }
        },
      schemaName =
        {
          val field = original.schemaName
          field.map { field =>
            field
          }
        },
      functionName =
        {
          val field = original.functionName
          field
        }
    )

  def newBuilder(): StructBuilder[TGetFunctionsReq] = new TGetFunctionsReqStructBuilder(_root_.scala.None, fieldTypes)

  override def encode(_item: TGetFunctionsReq, _oproto: TProtocol): Unit = {
    _item.write(_oproto)
  }


  private[this] def lazyDecode(_iprot: LazyTProtocol): TGetFunctionsReq = {

    var sessionHandle: org.apache.hive.service.rpc.thrift.TSessionHandle = null
    var _got_sessionHandle = false
    var catalogNameOffset: Int = -1
    var schemaNameOffset: Int = -1
    var functionNameOffset: Int = -1
    var _got_functionName = false

    var _passthroughFields: Builder[(Short, TFieldBlob), immutable$Map[Short, TFieldBlob]] = null
    var _done = false
    val _start_offset = _iprot.offset

    _iprot.readStructBegin()
    while (!_done) {
      val _field = _iprot.readFieldBegin()
      if (_field.`type` == TType.STOP) {
        _done = true
      } else {
        _field.id match {
          case 1 =>
            _field.`type` match {
              case TType.STRUCT =>
    
                sessionHandle = readSessionHandleValue(_iprot)
                _got_sessionHandle = true
              case _actualType =>
                val _expectedType = TType.STRUCT
                throw new TProtocolException(
                  "Received wrong type for field 'sessionHandle' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.STRING =>
                catalogNameOffset = _iprot.offsetSkipString
    
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'catalogName' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 3 =>
            _field.`type` match {
              case TType.STRING =>
                schemaNameOffset = _iprot.offsetSkipString
    
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'schemaName' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 4 =>
            _field.`type` match {
              case TType.STRING =>
                functionNameOffset = _iprot.offsetSkipString
    
                _got_functionName = true
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'functionName' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case _ =>
            if (_passthroughFields == null)
              _passthroughFields = immutable$Map.newBuilder[Short, TFieldBlob]
            _passthroughFields += (_field.id -> TFieldBlob.read(_field, _iprot))
        }
        _iprot.readFieldEnd()
      }
    }
    _iprot.readStructEnd()

    if (!_got_sessionHandle) throw new TProtocolException("Required field 'sessionHandle' was not found in serialized data for struct TGetFunctionsReq")
    if (!_got_functionName) throw new TProtocolException("Required field 'functionName' was not found in serialized data for struct TGetFunctionsReq")
    new LazyImmutable(
      _iprot,
      _iprot.buffer,
      _start_offset,
      _iprot.offset,
      sessionHandle,
      catalogNameOffset,
      schemaNameOffset,
      functionNameOffset,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  override def decode(_iprot: TProtocol): TGetFunctionsReq =
    _iprot match {
      case i: LazyTProtocol => lazyDecode(i)
      case i => eagerDecode(i)
    }

  private[thrift] def eagerDecode(_iprot: TProtocol): TGetFunctionsReq = {
    var sessionHandle: org.apache.hive.service.rpc.thrift.TSessionHandle = null
    var _got_sessionHandle = false
    var catalogName: _root_.scala.Option[String] = _root_.scala.None
    var schemaName: _root_.scala.Option[String] = _root_.scala.None
    var functionName: String = null
    var _got_functionName = false
    var _passthroughFields: Builder[(Short, TFieldBlob), immutable$Map[Short, TFieldBlob]] = null
    var _done = false

    _iprot.readStructBegin()
    while (!_done) {
      val _field = _iprot.readFieldBegin()
      if (_field.`type` == TType.STOP) {
        _done = true
      } else {
        _field.id match {
          case 1 =>
            _field.`type` match {
              case TType.STRUCT =>
                sessionHandle = readSessionHandleValue(_iprot)
                _got_sessionHandle = true
              case _actualType =>
                val _expectedType = TType.STRUCT
                throw new TProtocolException(
                  "Received wrong type for field 'sessionHandle' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.STRING =>
                catalogName = _root_.scala.Some(readCatalogNameValue(_iprot))
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'catalogName' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 3 =>
            _field.`type` match {
              case TType.STRING =>
                schemaName = _root_.scala.Some(readSchemaNameValue(_iprot))
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'schemaName' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 4 =>
            _field.`type` match {
              case TType.STRING =>
                functionName = readFunctionNameValue(_iprot)
                _got_functionName = true
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'functionName' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case _ =>
            if (_passthroughFields == null)
              _passthroughFields = immutable$Map.newBuilder[Short, TFieldBlob]
            _passthroughFields += (_field.id -> TFieldBlob.read(_field, _iprot))
        }
        _iprot.readFieldEnd()
      }
    }
    _iprot.readStructEnd()

    if (!_got_sessionHandle) throw new TProtocolException("Required field 'sessionHandle' was not found in serialized data for struct TGetFunctionsReq")
    if (!_got_functionName) throw new TProtocolException("Required field 'functionName' was not found in serialized data for struct TGetFunctionsReq")
    new Immutable(
      sessionHandle,
      catalogName,
      schemaName,
      functionName,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  def apply(
    sessionHandle: org.apache.hive.service.rpc.thrift.TSessionHandle,
    catalogName: _root_.scala.Option[String] = _root_.scala.None,
    schemaName: _root_.scala.Option[String] = _root_.scala.None,
    functionName: String
  ): TGetFunctionsReq =
    new Immutable(
      sessionHandle,
      catalogName,
      schemaName,
      functionName
    )

  def unapply(_item: TGetFunctionsReq): _root_.scala.Option[_root_.scala.Tuple4[org.apache.hive.service.rpc.thrift.TSessionHandle, Option[String], Option[String], String]] = _root_.scala.Some(_item.toTuple)


  @inline private[thrift] def readSessionHandleValue(_iprot: TProtocol): org.apache.hive.service.rpc.thrift.TSessionHandle = {
    org.apache.hive.service.rpc.thrift.TSessionHandle.decode(_iprot)
  }

  @inline private def writeSessionHandleField(sessionHandle_item: org.apache.hive.service.rpc.thrift.TSessionHandle, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(SessionHandleField)
    writeSessionHandleValue(sessionHandle_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeSessionHandleValue(sessionHandle_item: org.apache.hive.service.rpc.thrift.TSessionHandle, _oprot: TProtocol): Unit = {
    sessionHandle_item.write(_oprot)
  }

  @inline private[thrift] def readCatalogNameValue(_iprot: TProtocol): String = {
    _iprot.readString()
  }

  @inline private def writeCatalogNameField(catalogName_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(CatalogNameField)
    writeCatalogNameValue(catalogName_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeCatalogNameValue(catalogName_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeString(catalogName_item)
  }

  @inline private[thrift] def readSchemaNameValue(_iprot: TProtocol): String = {
    _iprot.readString()
  }

  @inline private def writeSchemaNameField(schemaName_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(SchemaNameField)
    writeSchemaNameValue(schemaName_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeSchemaNameValue(schemaName_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeString(schemaName_item)
  }

  @inline private[thrift] def readFunctionNameValue(_iprot: TProtocol): String = {
    _iprot.readString()
  }

  @inline private def writeFunctionNameField(functionName_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(FunctionNameField)
    writeFunctionNameValue(functionName_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeFunctionNameValue(functionName_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeString(functionName_item)
  }


  object Immutable extends ThriftStructCodec3[TGetFunctionsReq] {
    override def encode(_item: TGetFunctionsReq, _oproto: TProtocol): Unit = { _item.write(_oproto) }
    override def decode(_iprot: TProtocol): TGetFunctionsReq = TGetFunctionsReq.decode(_iprot)
    override lazy val metaData: ThriftStructMetaData[TGetFunctionsReq] = TGetFunctionsReq.metaData
  }

  /**
   * The default read-only implementation of TGetFunctionsReq.  You typically should not need to
   * directly reference this class; instead, use the TGetFunctionsReq.apply method to construct
   * new instances.
   */
  class Immutable(
      val sessionHandle: org.apache.hive.service.rpc.thrift.TSessionHandle,
      val catalogName: _root_.scala.Option[String],
      val schemaName: _root_.scala.Option[String],
      val functionName: String,
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends TGetFunctionsReq {
    def this(
      sessionHandle: org.apache.hive.service.rpc.thrift.TSessionHandle,
      catalogName: _root_.scala.Option[String] = _root_.scala.None,
      schemaName: _root_.scala.Option[String] = _root_.scala.None,
      functionName: String
    ) = this(
      sessionHandle,
      catalogName,
      schemaName,
      functionName,
      immutable$Map.empty[Short, TFieldBlob]
    )
  }

  /**
   * This is another Immutable, this however keeps strings as lazy values that are lazily decoded from the backing
   * array byte on read.
   */
  private[this] class LazyImmutable(
      _proto: LazyTProtocol,
      _buf: Array[Byte],
      _start_offset: Int,
      _end_offset: Int,
      val sessionHandle: org.apache.hive.service.rpc.thrift.TSessionHandle,
      catalogNameOffset: Int,
      schemaNameOffset: Int,
      functionNameOffset: Int,
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends TGetFunctionsReq {

    override def write(_oprot: TProtocol): Unit = {
      _oprot match {
        case i: LazyTProtocol => i.writeRaw(_buf, _start_offset, _end_offset - _start_offset)
        case _ => super.write(_oprot)
      }
    }

    lazy val catalogName: _root_.scala.Option[String] =
      if (catalogNameOffset == -1)
        None
      else {
        Some(_proto.decodeString(_buf, catalogNameOffset))
      }
    lazy val schemaName: _root_.scala.Option[String] =
      if (schemaNameOffset == -1)
        None
      else {
        Some(_proto.decodeString(_buf, schemaNameOffset))
      }
    lazy val functionName: String =
      if (functionNameOffset == -1)
        null
      else {
        _proto.decodeString(_buf, functionNameOffset)
      }

    /**
     * Override the super hash code to make it a lazy val rather than def.
     *
     * Calculating the hash code can be expensive, caching it where possible
     * can provide significant performance wins. (Key in a hash map for instance)
     * Usually not safe since the normal constructor will accept a mutable map or
     * set as an arg
     * Here however we control how the class is generated from serialized data.
     * With the class private and the contract that we throw away our mutable references
     * having the hash code lazy here is safe.
     */
    override lazy val hashCode = super.hashCode
  }

  /**
   * This Proxy trait allows you to extend the TGetFunctionsReq trait with additional state or
   * behavior and implement the read-only methods from TGetFunctionsReq using an underlying
   * instance.
   */
  trait Proxy extends TGetFunctionsReq {
    protected def _underlying_TGetFunctionsReq: TGetFunctionsReq
    override def sessionHandle: org.apache.hive.service.rpc.thrift.TSessionHandle = _underlying_TGetFunctionsReq.sessionHandle
    override def catalogName: _root_.scala.Option[String] = _underlying_TGetFunctionsReq.catalogName
    override def schemaName: _root_.scala.Option[String] = _underlying_TGetFunctionsReq.schemaName
    override def functionName: String = _underlying_TGetFunctionsReq.functionName
    override def _passthroughFields: immutable$Map[Short, TFieldBlob] = _underlying_TGetFunctionsReq._passthroughFields
  }
}

/**
 * Prefer the companion object's [[org.apache.hive.service.rpc.thrift.TGetFunctionsReq.apply]]
 * for construction if you don't need to specify passthrough fields.
 */
trait TGetFunctionsReq
  extends ThriftStruct
  with _root_.scala.Product4[org.apache.hive.service.rpc.thrift.TSessionHandle, Option[String], Option[String], String]
  with ValidatingThriftStruct[TGetFunctionsReq]
  with java.io.Serializable
{
  import TGetFunctionsReq._

  def sessionHandle: org.apache.hive.service.rpc.thrift.TSessionHandle
  def catalogName: _root_.scala.Option[String]
  def schemaName: _root_.scala.Option[String]
  def functionName: String

  def _passthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty

  def _1: org.apache.hive.service.rpc.thrift.TSessionHandle = sessionHandle
  def _2: _root_.scala.Option[String] = catalogName
  def _3: _root_.scala.Option[String] = schemaName
  def _4: String = functionName

  def toTuple: _root_.scala.Tuple4[org.apache.hive.service.rpc.thrift.TSessionHandle, Option[String], Option[String], String] = {
    (
      sessionHandle,
      catalogName,
      schemaName,
      functionName
    )
  }


  /**
   * Gets a field value encoded as a binary blob using TCompactProtocol.  If the specified field
   * is present in the passthrough map, that value is returned.  Otherwise, if the specified field
   * is known and not optional and set to None, then the field is serialized and returned.
   */
  def getFieldBlob(_fieldId: Short): _root_.scala.Option[TFieldBlob] = {
    lazy val _buff = new TMemoryBuffer(32)
    lazy val _oprot = new TCompactProtocol(_buff)
    _passthroughFields.get(_fieldId) match {
      case blob: _root_.scala.Some[TFieldBlob] => blob
      case _root_.scala.None => {
        val _fieldOpt: _root_.scala.Option[TField] =
          _fieldId match {
            case 1 =>
              if (sessionHandle ne null) {
                writeSessionHandleValue(sessionHandle, _oprot)
                _root_.scala.Some(TGetFunctionsReq.SessionHandleField)
              } else {
                _root_.scala.None
              }
            case 2 =>
              if (catalogName.isDefined) {
                writeCatalogNameValue(catalogName.get, _oprot)
                _root_.scala.Some(TGetFunctionsReq.CatalogNameField)
              } else {
                _root_.scala.None
              }
            case 3 =>
              if (schemaName.isDefined) {
                writeSchemaNameValue(schemaName.get, _oprot)
                _root_.scala.Some(TGetFunctionsReq.SchemaNameField)
              } else {
                _root_.scala.None
              }
            case 4 =>
              if (functionName ne null) {
                writeFunctionNameValue(functionName, _oprot)
                _root_.scala.Some(TGetFunctionsReq.FunctionNameField)
              } else {
                _root_.scala.None
              }
            case _ => _root_.scala.None
          }
        _fieldOpt match {
          case _root_.scala.Some(_field) =>
            _root_.scala.Some(TFieldBlob(_field, Buf.ByteArray.Owned(_buff.getArray())))
          case _root_.scala.None =>
            _root_.scala.None
        }
      }
    }
  }

  /**
   * Collects TCompactProtocol-encoded field values according to `getFieldBlob` into a map.
   */
  def getFieldBlobs(ids: TraversableOnce[Short]): immutable$Map[Short, TFieldBlob] =
    (ids flatMap { id => getFieldBlob(id) map { id -> _ } }).toMap

  /**
   * Sets a field using a TCompactProtocol-encoded binary blob.  If the field is a known
   * field, the blob is decoded and the field is set to the decoded value.  If the field
   * is unknown and passthrough fields are enabled, then the blob will be stored in
   * _passthroughFields.
   */
  def setField(_blob: TFieldBlob): TGetFunctionsReq = {
    var sessionHandle: org.apache.hive.service.rpc.thrift.TSessionHandle = this.sessionHandle
    var catalogName: _root_.scala.Option[String] = this.catalogName
    var schemaName: _root_.scala.Option[String] = this.schemaName
    var functionName: String = this.functionName
    var _passthroughFields = this._passthroughFields
    _blob.id match {
      case 1 =>
        sessionHandle = readSessionHandleValue(_blob.read)
      case 2 =>
        catalogName = _root_.scala.Some(readCatalogNameValue(_blob.read))
      case 3 =>
        schemaName = _root_.scala.Some(readSchemaNameValue(_blob.read))
      case 4 =>
        functionName = readFunctionNameValue(_blob.read)
      case _ => _passthroughFields += (_blob.id -> _blob)
    }
    new Immutable(
      sessionHandle,
      catalogName,
      schemaName,
      functionName,
      _passthroughFields
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetField(_fieldId: Short): TGetFunctionsReq = {
    var sessionHandle: org.apache.hive.service.rpc.thrift.TSessionHandle = this.sessionHandle
    var catalogName: _root_.scala.Option[String] = this.catalogName
    var schemaName: _root_.scala.Option[String] = this.schemaName
    var functionName: String = this.functionName

    _fieldId match {
      case 1 =>
        sessionHandle = null
      case 2 =>
        catalogName = _root_.scala.None
      case 3 =>
        schemaName = _root_.scala.None
      case 4 =>
        functionName = null
      case _ =>
    }
    new Immutable(
      sessionHandle,
      catalogName,
      schemaName,
      functionName,
      _passthroughFields - _fieldId
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetSessionHandle: TGetFunctionsReq = unsetField(1)

  def unsetCatalogName: TGetFunctionsReq = unsetField(2)

  def unsetSchemaName: TGetFunctionsReq = unsetField(3)

  def unsetFunctionName: TGetFunctionsReq = unsetField(4)


  override def write(_oprot: TProtocol): Unit = {
    TGetFunctionsReq.validate(this)
    _oprot.writeStructBegin(Struct)
    if (sessionHandle ne null) writeSessionHandleField(sessionHandle, _oprot)
    if (catalogName.isDefined) writeCatalogNameField(catalogName.get, _oprot)
    if (schemaName.isDefined) writeSchemaNameField(schemaName.get, _oprot)
    if (functionName ne null) writeFunctionNameField(functionName, _oprot)
    if (_passthroughFields.nonEmpty) {
      _passthroughFields.values.foreach { _.write(_oprot) }
    }
    _oprot.writeFieldStop()
    _oprot.writeStructEnd()
  }

  def copy(
    sessionHandle: org.apache.hive.service.rpc.thrift.TSessionHandle = this.sessionHandle,
    catalogName: _root_.scala.Option[String] = this.catalogName,
    schemaName: _root_.scala.Option[String] = this.schemaName,
    functionName: String = this.functionName,
    _passthroughFields: immutable$Map[Short, TFieldBlob] = this._passthroughFields
  ): TGetFunctionsReq =
    new Immutable(
      sessionHandle,
      catalogName,
      schemaName,
      functionName,
      _passthroughFields
    )

  override def canEqual(other: Any): Boolean = other.isInstanceOf[TGetFunctionsReq]

  private def _equals(x: TGetFunctionsReq, y: TGetFunctionsReq): Boolean =
      x.productArity == y.productArity &&
      x.productIterator.sameElements(y.productIterator) &&
      x._passthroughFields == y._passthroughFields

  override def equals(other: Any): Boolean =
    canEqual(other) &&
      _equals(this, other.asInstanceOf[TGetFunctionsReq])

  override def hashCode: Int = {
    _root_.scala.runtime.ScalaRunTime._hashCode(this)
  }

  override def toString: String = _root_.scala.runtime.ScalaRunTime._toString(this)


  override def productArity: Int = 4

  override def productElement(n: Int): Any = n match {
    case 0 => this.sessionHandle
    case 1 => this.catalogName
    case 2 => this.schemaName
    case 3 => this.functionName
    case _ => throw new IndexOutOfBoundsException(n.toString)
  }

  override def productPrefix: String = "TGetFunctionsReq"

  def _codec: ValidatingThriftStructCodec3[TGetFunctionsReq] = TGetFunctionsReq

  def newBuilder(): StructBuilder[TGetFunctionsReq] = new TGetFunctionsReqStructBuilder(_root_.scala.Some(this), fieldTypes)
}

private[thrift] class TGetFunctionsReqStructBuilder(instance: _root_.scala.Option[TGetFunctionsReq], fieldTypes: IndexedSeq[ClassTag[_]])
    extends StructBuilder[TGetFunctionsReq](fieldTypes) {

  def build(): TGetFunctionsReq = instance match {
    case _root_.scala.Some(i) =>
      TGetFunctionsReq(
        (if (fieldArray(0) == null) i.sessionHandle else fieldArray(0)).asInstanceOf[org.apache.hive.service.rpc.thrift.TSessionHandle],
        (if (fieldArray(1) == null) i.catalogName else fieldArray(1)).asInstanceOf[_root_.scala.Option[String]],
        (if (fieldArray(2) == null) i.schemaName else fieldArray(2)).asInstanceOf[_root_.scala.Option[String]],
        (if (fieldArray(3) == null) i.functionName else fieldArray(3)).asInstanceOf[String]
      )
    case _root_.scala.None =>
      if (fieldArray.contains(null)) throw new InvalidFieldsException(structBuildError("TGetFunctionsReq"))
      else {
        TGetFunctionsReq(
          fieldArray(0).asInstanceOf[org.apache.hive.service.rpc.thrift.TSessionHandle],
          fieldArray(1).asInstanceOf[_root_.scala.Option[String]],
          fieldArray(2).asInstanceOf[_root_.scala.Option[String]],
          fieldArray(3).asInstanceOf[String]
        )
      }
    }
}

