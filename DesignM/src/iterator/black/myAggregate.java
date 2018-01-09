package iterator.black;


public class myAggregate extends aggregate {
	public Object[] objArray;
	public myAggregate(Object[] objArray) {
		super();
		this.objArray = objArray;
	}
	@Override
	public iterator createIterator() {
		return new myIterator();
	}
	//匿名内部类，对外封闭
	private class myIterator implements iterator {
		public int index;
		public myIterator() {
			super();
			this.index=0;
		}
		@Override
		public void first() {
	       this.index=0;
		}
		@Override
		public boolean isTail() {
	      if(this.index>(objArray.length-1)){
	    	  return true;
	      }
	      return false;
		}
		@Override
		public void next() {
			if(this.index<=(objArray.length-1)){
				index++;
			}else{
				index=objArray.length-1;
			}
		}
		@Override
		public Object getCurrentItem() {
			return objArray[index];
		}
	}
}
