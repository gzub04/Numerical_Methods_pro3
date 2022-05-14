function [cond_num, err, a_vector, x, y] = poly_approximation(degree)
    A = zeros(11, degree+1);    % create array A, +1 because degree 0 of polynomial is also allowed
    x = [-5; -4; -3; -2; -1; 0; 1; 2; 3; 4; 5];
    y = [-4.2606; -2.26804; -0.7699; -0.4666; 1.1236; 0.8029; 0.1697; -3.3483; -10.3280; -20.4417; -33.2458];

    for i = 1:11    % 11 because we have 11 experimental measurements
        for j = 1:(degree+1)
            A(i, j) = x(i)^(j-1);   % (j-1) because we start every row with x^0 and end with x^degree, which is also x^(j+1)
        end
    end
    cond_num = (cond(A))^2;    % calculate condition number for A^T * A
    [Q, R] = external_qrmgs(A); % calculate Q and R
    a_vector = R \ (Q' * y);    % calculate resulting coefficients a
    a_vector = flip(a_vector);    % reorder to descending order so that it is accepted by matlab's polyval function
    calculated_values = polyval(a_vector, x);  % calculates values at set x's
    err = norm(calculated_values - y);    % calculates error residuum
end