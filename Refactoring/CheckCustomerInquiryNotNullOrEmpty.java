private void CheckCustomerInquiryNotNullOrEmpty (Customer InquiryRequest request)
{
  // Check both parameters are not null or empty string
  if(!string.IsNullOrEmpty(request.Customer Product. Product Number) && 
     !string.IsNullOrEmpty(request.Customer.CustomerID))
  {
    // Both were populated
    throw new BusinessException(HandledErrors.InvalidBothParameterMessage);
  }
}