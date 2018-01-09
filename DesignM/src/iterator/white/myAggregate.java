package iterator.white;


public class myAggregate extends aggregate {
	public Object[] objArray;
	public myAggregate(Object[] objArray) {
		super();
		this.objArray = objArray;
	}
	@Override
	public iterator createIterator() {
		return new myIterator(this);
	}
	public int getSize(){
		return this.objArray.length;
	}
	/*
	 * 封装集合类：本身提供了对外遍历的方法
	 */
	public Object getCurrentObj(int index){
		if(index>=this.objArray.length){
		    return null;
		}else{
			return this.objArray[index];
		}
	}
}
