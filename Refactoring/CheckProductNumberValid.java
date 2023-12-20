private void CheckProductNumberValid( CustomerInquiryRequest request, int productFieldLength)
{
  if(string.IsNullOrEmpty(request.Customer Product. ProductNumber))
  {
  	// Check Product Length
  	if request.Customer Product.ProductNumber.Length > productFieldLength)
  	{
    		throw new BusinessException(HandledErrors. ProductInvalidLengthMessage );
  	}
  	// Pad the left of the product number
  	request.Customer Product. Product Number = request.CustomerProduct.ProductNumber.PadLeft(productFieldLength,Convert.ToChar( "0",
  	CultureInfo.CurrentCulture ) );
    }
}