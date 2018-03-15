package hibernate.text;

public class SourceReviewRecord {

	
	/**
	 * **** hibernate release connection **************
	 *  org.hibernate.transaction.JDBCTransaction commit() -->
	 *  **/
//	public void commit() throws HibernateException {
//		if (!begun) {
//			throw new TransactionException("Transaction not successfully started");
//		}
//
//		log.debug("commit");
//
//		if ( !transactionContext.isFlushModeNever() && callback ) {
//			transactionContext.managedFlush(); //if an exception occurs during flush, user must call rollback()
//		}
//
//		notifySynchronizationsBeforeTransactionCompletion();
//		if ( callback ) {
//			jdbcContext.beforeTransactionCompletion( this );
//		}
//
//		try {
//			commitAndResetAutoCommit();
//			log.debug("committed JDBC Connection");
//			committed = true;
//			if ( callback ) {
//				jdbcContext.afterTransactionCompletion( true, this );
//			}
//			notifySynchronizationsAfterTransactionCompletion( Status.STATUS_COMMITTED );
//		}
//		catch (SQLException e) {
//			log.error("JDBC commit failed", e);
//			commitFailed = true;
//			if ( callback ) {
//				jdbcContext.afterTransactionCompletion( false, this );
//			}
//			notifySynchronizationsAfterTransactionCompletion( Status.STATUS_UNKNOWN );
//			throw new TransactionException("JDBC commit failed", e);
//		}
//		finally {
//			closeIfRequired();
//		}
//	}
	
	 /***
	 *  org.hibernate.jdbc.JDBCContext  afterTransactionCompletion
	 **/
//	 public void afterTransactionCompletion(boolean success, Transaction tx) {
//		log.trace( "after transaction completion" );
//
//		if ( getFactory().getStatistics().isStatisticsEnabled() ) {
//			getFactory().getStatisticsImplementor().endTransaction(success);
//		}
//
//		connectionManager.afterTransaction();
//
//		isTransactionCallbackRegistered = false;
//		hibernateTransaction = null;
//		owner.afterTransactionCompletion(success, tx);
//	}
	 /***  
	 **  org.hibernate.jdbc.ConnectionManager afterTransaction()
	 * 
	 * To be called after local transaction completion.  Used to conditionally
	 * release the JDBC connection aggressively if the configured release mode
	 * indicates.
	 */
/*	public void afterTransaction() {
		if ( isAfterTransactionRelease() ) {
			aggressiveRelease();
		}
		else if ( isAggressiveReleaseNoTransactionCheck() && batcher.hasOpenResources() ) {
			log.info( "forcing batcher resource cleanup on transaction completion; forgot to close ScrollableResults/Iterator?" );
			batcher.closeStatements();
			aggressiveRelease();
		}
		else if ( isOnCloseRelease() ) {
			// log a message about potential connection leaks
			log.debug( "transaction completed on session with on_close connection release mode; be sure to close the session to release JDBC resources!" );
		}
		batcher.unsetTransactionTimeout();
	}
	
	/**
	 * Performs actions required to perform an aggressive release of the
	 * JDBC Connection.
	 */
/*////	private void aggressiveRelease() {
////		if ( !wasConnectionSupplied ) {
////			log.debug( "aggressively releasing JDBC connection" );
////			if ( connection != null ) {
////				closeConnection();
////			}
////		}
////	}	
//**
//	 * Physically closes the JDBC Connection.
//	 *//*
	private void closeConnection() {
		if ( log.isDebugEnabled() ) {
			log.debug(
					"releasing JDBC connection [" +
					batcher.openResourceStatsAsString() + "]"
				);
		}

		try {
			if ( !connection.isClosed() ) {
				JDBCExceptionReporter.logAndClearWarnings( connection );
			}
			factory.getConnectionProvider().closeConnection( connection );
			connection = null;
		}
		catch (SQLException sqle) {
			throw JDBCExceptionHelper.convert( 
					factory.getSQLExceptionConverter(), 
					sqle, 
					"Cannot release connection"
				);
		}
	}	*/
	 
	
	/***
	 * 
	 * 
	 * 
	 */
	 
	
	
}
